(ns tutorial.exceptions)

(defn ExHandling
  [x]
  (try 
    (inc x)
    (catch ClassCastException e (println "Error:" (.getMessage e)))
    (catch Exception e (println "Generic error:" (.getMessage e)))
    (finally (do (println "finally 1") (println "finally 2")))
    )
  )

(ExHandling "test")