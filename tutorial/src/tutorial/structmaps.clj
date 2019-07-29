(ns tutorial.structmaps)

(defn Pets
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "Batman"))
  (println myPet)

  (def myOtherPet (struct-map pet :PetName "Adilson" :PetType "dog"))
  (println myOtherPet)
  (println (:PetName myPet))
  (println (:PetType myOtherPet))

  (def myNewPet (assoc myPet :PetName "Max"))
  (println myPet)
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myOtherPet)
  (println myNewOtherPet)
  )

(Pets)