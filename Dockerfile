FROM debian:stretch

ENV DEBIAN_FRONTEND noninteractive

# Oracle Java 8
RUN apt-get update \
    && apt-get install -y curl wget openssl ca-certificates 

ARG JAVA_VERSION=8
ARG JAVA_RELEASE=JRE

RUN bash -c ' \
    set -euxo pipefail && \
    apt-get update && \
    pkg="openjdk-$JAVA_VERSION"; \
    if [ "$JAVA_RELEASE" = "JDK" ]; then \
        pkg="$pkg-jdk"; \
    else \
        pkg="$pkg-jre-headless"; \
    fi; \
    apt-get install -y --no-install-recommends "$pkg" && \
    apt-get clean \
    '

# COPY profile.d/java.sh /etc/profile.d/

ENV JAVA_HOME=/usr

RUN bash -c ' \
    cd /usr/bin && \
    curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh && \
    chmod +x boot \
    '

ENV JAVA_HOME /opt/java

# Install NodeJS and tooling
RUN true \
&& curl -sL https://deb.nodesource.com/setup_14.x | bash - \
&& apt install -y nodejs \
&& npm install -g autoprefixer@10.2.4 postcss@8.2.6 postcss-cli@8.3.1 

# Boot
ENV BOOT_HOME /.boot
ENV BOOT_AS_ROOT yes
ENV BOOT_LOCAL_REPO /m2
ENV BOOT_JVM_OPTIONS=-Xmx2g

# download & install deps, cache REPL and web deps
RUN /usr/bin/boot web -s doesnt/exist repl -e '(System/exit 0)' && rm -rf target

ADD . /perun/
WORKDIR /perun/
EXPOSE 3000
RUN /usr/bin/boot build target

# CMD /usr/bin/boot build target
CMD /usr/bin/boot dev
