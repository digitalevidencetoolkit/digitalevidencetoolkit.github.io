(ns site.core
  (:require [hiccup.page :as hp]))

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:http-equiv "X-UA-Compatible"
           :content "IE=edge,chrome=1"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
   [:link {:href "https://fonts.googleapis.com/css?family=Roboto:400,700"
           :rel "stylesheet"
           :type "text/css"}]
   [:link {:href "https://digitalevidencetoolkit.org/favicon.png"
           :rel "icon"
           :type "image/png"}]
   [:title "Digital Evidence Toolkit"]
   (hp/include-css "site.main.css")])

(defn header []
  [:header
   [:div {:class "tc pa4"}
    [:img {:class "br-100 pa1 ba b--black-10 h3 w3"
           :src "logo.png"}]]
   [:h1 {:class "f2-s f1-m f1-l tc lh-title mt0 mb5"}
    "The Digital Evidence Preservation Toolkit"]])

(defn slim-header []
  [:header
   [:a {:href "/"
        :class "nodeco"}
    [:h1 {:class "f3-s f3-m f3-l tc lh-title mt0 mb4"}
    "The Digital Evidence Preservation Toolkit"]]
   [:hr]])

(defn newsletter-embed []
  [:iframe {:scrolling "no"
            :width "100%"
            :height "280"
            :frameborder "0"
            :src "https://digitalevidencetoolkit.substack.com/embed"}])

(defn flex-row-of-pictures [list]
  [:div {:class "flex"}
   (for [item list]
     [:img {:src item}])])

(defn footer []
  (let [funders ["https://prototypefund.de/wp-content/uploads/2016/07/logo-bmbf.svg"
                 "https://prototypefund.de/wp-content/uploads/2016/07/logo-okfn.svg"]]
    [:footer {:class "bt"}
     [:p "With the generous funding and support of"]
     (flex-row-of-pictures funders)]))
