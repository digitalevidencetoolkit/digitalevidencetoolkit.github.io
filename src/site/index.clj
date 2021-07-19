(ns site.index
  (:require [hiccup.page :as hp]
            [site.core :as core]))

(defn render [{global-meta :meta posts :entries}]
  (hp/html5
   (core/head)
   [:body {:class "w-90 w-80-m mw100-ns mw6-l center pv5"}
    (core/header)

    [:section {:class "pv0 mb4"}
     [:p {:class "lh-copy"}
      "Every day, dedicated investigative journalists and human rights monitors scour 
       the Web in search of proof of abuse, wrongdoing, and crime. The material they 
       gather is at risk of being ruled inadmissible and dismissed out of hand in court."]
     [:p {:class "lh-copy"}
      "Ahead of verification and authenticity concerns, preserving this material appropriately 
       is a difficult problem drawing on several technically-advanced fields: from the high 
       standards of the maintenance of the chain of custody to the cost of storage, the need 
       for accessibility and availability of the material years into the future, the challenges 
       are considerable – and a lot for one organisation to take on."]

     [:span {:class "f3 lh-title"}
      "The Digital Evidence Toolkit is an advocacy project bringing together scholars, experts, 
       practitioners and activists."]

     [:p {:class "lh-copy"}
      "It aims:"]
     [:ul
      [:li {:class "lh-copy"}
       "To raise awareness of the seriousness of the problem ;"]
      [:li {:class "lh-copy"}
       "To offer a minimum viable product highlighting the basic requirements of proper 
        evidence preservation ;"]
      [:li {:class "lh-copy"}
       "To highlight different challenges and solutions fitting different organisations and fields."]]]

    [:section {:class "pv0 bt"}
     [:h4 {:class "f3 lh-copy"}
      "Archives and resources"]
     [:ul {:class "items columns small-12 mb4"}
      (for [post posts]
        [:section
         [:h3 {:class "mb0"}
          [:a {:href (:permalink post)} (:title post)]]
         [:p {:class "mt0"}
          (:description post)]])]]

    [:section {:class "bt"}
     (core/newsletter-embed)]
    [:section
     (core/footer)]]))
