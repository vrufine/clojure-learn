(ns tutorial.challenge2)

(defn CheckCouponCode [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20OFF" 0.8))
  (if (= (:Name validCoupon) code)
    true
    false))

; (CheckCouponCode "20OFF")

(defn GetCarPrices
  [budget code]
  (def cars {"bmw" 60000 "ferrari" 100000 "fiat" 20000})
  (if (CheckCouponCode code)
    (do
      (println "Valid coupon :)")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (def carType (first car))
        (def carPrice (last car))
        (def discountPrice (* carPrice discount))
        (if (<= discountPrice budget)
          (println "The" carType "costs:" discountPrice)
        )
      )
    )
    (do
      (println "Invalid coupon :(")
      (doseq [car cars]
        (def carType (first car))
        (def carPrice (last car))
        (if (<= carPrice budget)
          (println "The" carType "costs:" carPrice)
        )
      )
    )
  )
)

;(GetCarPrices 50000 "20OFF")