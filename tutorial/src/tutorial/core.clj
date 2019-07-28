(ns tutorial.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [greet name]
  (println greet "," name "!!!"))

(-main "Hello" "World")