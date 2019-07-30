(ns tutorial.Agents)


(defn Agents
  []
  (def amount (agent 100))
  (println @amount)

  (send amount inc)
  (println 1 @amount)
  (println 2 @amount)
  (println 3 @amount)

  (send amount inc)
  (await-for 1500 amount)
  (println 4 @amount)

  (println (agent-error amount))
  )

(Agents)