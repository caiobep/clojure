(ns armstrong-numbers)

(defn armstrong?
  "Checks if provided number num is a armstrong number"
  ([] nil)
  ([num]
    (=
      (let [numbers (map #(Character/digit % 10) (str num))
            empowerd-numbers (map #(reduce * (repeat (.length (str num)) %)) numbers)
            empowerd-numbers-sum (reduce + empowerd-numbers)]
        empowerd-numbers-sum)
      num))
)
