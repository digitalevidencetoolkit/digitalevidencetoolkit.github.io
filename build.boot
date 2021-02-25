(set-env!
  :source-paths   #{"src"}
  :resource-paths #{"content"}
  :dependencies '[[javax.xml.bind/jaxb-api    "2.3.0"]
                  [perun                      "0.4.3-SNAPSHOT" :scope "test"]
                  [deraen/boot-sass           "0.2.1"]
                  [deraen/boot-livereload     "0.2.1"]
                  [danielsz/boot-autoprefixer "0.1.0"]
                  [hiccup                 "1.0.5" :exclusions [org.clojure/clojure]]
                  [pandeiro/boot-http     "0.8.3" :exclusions [org.clojure/clojure]]])

(require '[io.perun               :as perun]
         '[pandeiro.boot-http     :as  http]
         '[deraen.boot-sass       :refer         [sass]]
         '[deraen.boot-livereload :refer   [livereload]]
         '[danielsz.autoprefixer  :refer [autoprefixer]])

(deftask build []
  (comp (sass)
        (autoprefixer :files ["site.main.css", "site.main.scss"])
        (perun/markdown)
        (perun/render :renderer 'site.core/page)))

(deftask dev []
  (comp (watch)
        (build)
        (perun/inject-scripts :scripts       #{"js/livereload.js"})
        (livereload           :asset-path    "public" :filter #"\.(css|html|js)$")
        (http/serve           :resource-root "public")))
