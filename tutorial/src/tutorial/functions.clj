(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function (*OPTIONAL*)"
  []
  (println "This is the main function")
  (println "Second statement")
  (+ 2 5))

; anonymous function
; (#(println "Good night, Mr." %1 ". How are you " %2 "?") "John" "today")

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))