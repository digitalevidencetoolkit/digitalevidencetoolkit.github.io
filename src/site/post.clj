(ns site.post
  (:require [hiccup.page :as hp]
            [site.core   :as core]))

(defn render [{global-meta :meta posts :entries post :entry}]
  (hp/html5
   (core/head)
   [:body {:class "w-80 mw100-ns mw6-l center pv5"}
    (core/slim-header)
    [:section
     (:content post)]
    [:section
    [:a {:href "/"
         :class "nodeco"}"← Back to homepage"]
     (core/newsletter-embed)]
    (core/footer)]))
