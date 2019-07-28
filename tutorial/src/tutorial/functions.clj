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

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "String")
  (def h 'customkey)

  (def status true)
  (def STATUS false)

  (println a b c d e f g h status STATUS)
)

(DataTypes)