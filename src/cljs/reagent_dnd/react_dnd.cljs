(ns reagent-dnd.react-dnd
  (:require
   [reagent.core :as r]
   ["react-dnd" :as react-dnd]
   ;; ["react-dnd-html5-backend" :as html5-backend]
   ))

(def drag-drop-context react-dnd/DragDropContext)

(def drag-layer react-dnd/DragLayer)

(def drag-source react-dnd/DragSource)

(def drop-target react-dnd/DropTarget)

;; (def html5-backend html5-backend)

(def get-empty-image (.getEmptyImage html5-backend))

(defn with-drag-drop-context [backend]
  (fn [component]
    (r/adapt-react-class
     ((drag-drop-context backend)
      (r/reactify-component component)))))
