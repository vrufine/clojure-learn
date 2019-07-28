(ns tutorial.conditionals)

(defn CondIf
  []
  (println "Alright!")
  (if (= 5 5)
    (println "Equal!")
    (println "Not equal!")
  ))

; (CondIf)

(defn CondIfDo
  []
  (println "Alright! 2")
  (if (= 5 4)
    (do (println "Equal first") (println "Equal second"))
    (do (println "Not equal 1") (println "Not equal 2"))
  ))

; (CondIfDo)

(defn CondNestedIf
  []
  (println "Nested if:")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "True!")
    (println "False!")
  ))

; (CondNestedIf)

(defn CondCase
  [pet]
  (println "Cond case:")
  (case pet
    "cat" (println "This is a cat")
    "dog" (println "This is a dog")
    "fish" (println "This is a fish")
    ))

; (CondCase "cat")

(defn CondCond
  [amount]
  (println "Cond Cond")
  (cond
    (> amount 5) (println "greather than 5")
    (<= amount 2) (println "smaller or equal 2")
    (= amount 3) (println "this is 3")
    :else (println "Other number...")
  ))

(CondCond 4)