(ns hello-world)

(defn hello
  "Greets a provided name"
  ([] "Hello, World!")
  ([name] (str "Hello, " name "!"))
  ([name, surname] (str "Hello, " name " " surname "!")))
