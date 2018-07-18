(ns bob
  (:require [clojure.string :as str]))

(defn question? [word]
  (str/ends-with? word "?"))

(defn shout? [s]
  (and
   (boolean (re-find #"[A-Z]" s))
   (= s (str/upper-case s))))

(defn response-for [s]
  (cond
    (str/blank? s) "Fine. Be that way!"
    (and (question? s) (shout? s)) "Calm down, I know what I'm doing!" ; Forcefull question
    (question? s) "Sure."
    (shout? s) "Whoa, chill out!"
    :else "Whatever."))
