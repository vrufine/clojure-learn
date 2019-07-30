(ns tutorial.BankChallenge)

(def BuyerAccount {'balance (ref 100)})
(def MerchantAccount {'balance (ref 0)})
(def PurchasedItems (ref []))
(def items {'pen 1, 'notebook 5, 'backpack 10 })

(defn BuyItem
  [item]
  (def desiredItemPrice (get items item))
  (def buyerMoney (get BuyerAccount 'balance))
  (def merchantMoney (get MerchantAccount 'balance))
  (def buyerHasEnoughMoney (>= @buyerMoney desiredItemPrice))
  (if buyerHasEnoughMoney
    (do
      (dosync
        (ref-set buyerMoney (- @buyerMoney desiredItemPrice))
        (ref-set merchantMoney (+ @merchantMoney desiredItemPrice))
        (ref-set PurchasedItems (concat @PurchasedItems [item]))
        )
      (println "Buyer just purchased a" item)
      )
    (do
      (println "Buyer doesn't have enough money to buy a" item))
    )
  (println "Buyer balance:" @buyerMoney)
  (println "Merchant balance:" @merchantMoney)
  (println "Purchased items:" @PurchasedItems)
  (println "---------------------------------------------------------")
  )

(BuyItem 'notebook)
(BuyItem 'pen)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'pen)
(BuyItem 'notebook)
(BuyItem 'notebook)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'backpack)
(BuyItem 'pen)
(BuyItem 'pen)
(BuyItem 'pen)
(BuyItem 'pen)
