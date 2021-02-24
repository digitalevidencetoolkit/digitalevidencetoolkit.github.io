(set-env!
  :source-paths #{"src"}
  :resource-paths #{"content"}
  :dependencies '[[perun "0.4.3-SNAPSHOT" :scope "test"]
                  [hiccup "1.0.5" :exclusions [org.clojure/clojure]]
                  [deraen/boot-sass "0.2.1"]
                  [pandeiro/boot-http "0.8.3" :exclusions [org.clojure/clojure]]])

(require '[io.perun :as perun]
         '[deraen.boot-sass :refer [sass]]
         '[pandeiro.boot-http :refer [serve]])

(deftask build []
  (comp (sass)
        (perun/markdown)
        (perun/render :renderer 'site.core/page)))

(deftask dev []
  (comp (watch)
        (build)
        (serve :resource-root "public")))
