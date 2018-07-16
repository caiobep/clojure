(ns armstrong-numbers)

(defn armstrong?
   "Checks if provided number num is a armstrong number"
  ([] nil)
  ([n]
    (->>  (str n)
          (map #(Character/digit % 10))
          (map #(reduce * (repeat (.length (str n)) %)) )
          (reduce +)
          (= n))))
