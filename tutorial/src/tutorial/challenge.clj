(ns tutorial.challenge (:gen-class))

(defn ageConversor
  [ratio petAge]
  (* petAge ratio))

(defn conversor
  [type age]
  (def petRatios {'dog 7, 'cat 5, 'fish 10})
  (ageConversor (get petRatios type) age))

(defn convertToHuman
  "Receives a number and a function to convert"
  [age type]
  (println "Received age:" age)
  (def convertedAge (conversor type age))
  (println "Converted age:" convertedAge))

; 'dog / 'cat / 'fish
(convertToHuman 3 'fish)