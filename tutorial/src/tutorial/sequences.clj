(ns tutorial.sequences)

(defn Seq []
  (def colors (seq ["red" "green" "blue"]))
  (println "Colors:" colors)

  (println (cons "yellow" colors))
  (println (cons colors "yellow"))

  (println (conj colors "yellow"))
  (println (conj ["red" "green" "blue"] "yellow"))

  (println (concat colors (seq ["black" "white"])))

  (println (distinct (seq [1 2 3 4 5 4 3 2 1])))

  (println (reverse colors))

  (println (first colors))
  (println (rest colors))
  (println (last colors))

  (println (sort (seq [1 3 5 7 9 2 4 6 8 0])))
  )
(Seq)