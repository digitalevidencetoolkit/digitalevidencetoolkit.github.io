(ns site.core
  (:require [hiccup.page :as hp]))

(def funders
  ["https://prototypefund.de/wp-content/uploads/2016/07/logo-bmbf.svg", "https://prototypefund.de/wp-content/uploads/2016/07/logo-okfn.svg"])

(defn flex-row-of-pictures [list]
  [:div {:class "flex"}
   (for [item list]
    [:img {:src item}])])

(defn analytics []
  [:script "var _paq = window._paq = window._paq || [];
  /* tracker methods like 'setCustomDimension' should be called before 'trackPageView' */
  _paq.push(['trackPageView']);
  _paq.push(['enableLinkTracking']);
  (function() {
    var u='//analytics.basilesimon.fr/';
    _paq.push(['setTrackerUrl', u+'matomo.php']);
    _paq.push(['setSiteId', '2']);
    var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
    g.type='text/javascript'; g.async=true; g.src=u+'matomo.js'; s.parentNode.insertBefore(g,s);
  })();"])

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
    (analytics)
    (hp/include-css "site.main.css")])

(defn header []
  [:header
   [:div {:class "tc pa4"}
    [:img {:class "br-100 pa1 ba b--black-10 h3 w3"
           :src "logo.png"}]]
   [:h1 {:class "f1 lh-title mt0"}
    "The Digital Evidence Preservation Toolkit"]])

(defn newsletter-embed []
  [:iframe {:scrolling "no"
            :width "100%"
            :height "280"
            :frameborder "0"
            :src "https://digitalevidencetoolkit.substack.com/embed"}])

(defn footer []
  [:footer
   [:hr]
   [:p "With the generous funding and support of"]
   (flex-row-of-pictures funders)])

(defn page [data]
  (hp/html5
   (head)
   [:body {:class "w-80 mw100-ns mw6-l center pv5"}
    (header)
    [:section {:class "pv0"}
     (-> data :entry :content)]
    [:section
     (newsletter-embed)]
    (footer)]))
