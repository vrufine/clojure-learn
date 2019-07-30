(ns tutorial.Namespaces
  (:require [clojure.string :refer [capitalize]]))

(defn -main
  []
  (println (capitalize "hello world")))

(-main)