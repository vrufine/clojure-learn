(ns tutorial.loops)

(defn Loop
  []
  (println "\nLoop:")
  (loop [x 0]
    (when (< x 10)
      (println "Current loop:" x)
      (recur (inc x))
    )
  ))

; (Loop)

(defn DoTimes
  [times]
  (println "DoTimes:")
  (dotimes [idx times]
    (println "Current loop:" idx))
  )

; (DoTimes 3)

(defn WhileDo
  [count]
  (println "WhileDo:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x "/" (- count 1))
      (swap! x inc))
  ))

; (WhileDo 10)

(defn DoSeq
  [seq]
  (println "DoSeq:")
  (doseq [x seq]
    (println "Name:" (get x name))
  ))

; (DoSeq [ {name "Vinicius"} {name "Daniel"} {name "Guilherme"} ])