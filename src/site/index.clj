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
       are considerable – and a lot for one organisation to take on."]]

    [:section {:class "bt"}
     [:h5 {:class "f3 lh-copy mb0"}
      "Our goals"]
     [:p
      "We aim to provide" [:b " a proof-of-concept software"] " for researchers and small teams 
       sifting through online material. With only one click of the mouse, the material will be"
       [:b " archived in a framework demonstrating chain of custody and stored durably"]  ". 
       Once included in the growing database, users will be able to go back to" [:b " search 
       through and annotate"] " the material, and to " [:b "export working copies"] " of said 
       material for publication and dissemination."]

     [:h5 {:class "f3 lh-copy mb0"}
      "Our aims"]
     [:p
      "A database built thusly can be handed to a prosecutor ten years down 
       the line, and they will be able to say with mathematical certainty:" [:b "“the material 
       in this archive is identical and contemporary to the one saved at the time, ten years ago.”"]]

     [:p
      "We want this to be the plastic sealed bag in which evidence is deposited, and which is then 
       kept under watch in an evidence room, where each access is tracked and reported in a log."
      ]]
    
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
