(ns tutorial.challenge2)

(defn CheckCoupon [code]
  (def validCoupons [123 456 789])
  (some #(= code %) validCoupons))

(defn ApplyDiscount
  [budget code]
  (def couponIsValid (CheckCoupon code))
  (cond
    (and
      (= couponIsValid nil)
      (= budget 50000)) (do
        (println "FIAT: 20.0000"))
    (and
      (not= couponIsValid nil)
      (= budget 50000)) (do
        (println "BMW: 48.000")
        (println "FIAT: 16.000"))
    :else (println "Invalid Budget or Coupon Code")
  )
)

(ApplyDiscount 50000 1234)