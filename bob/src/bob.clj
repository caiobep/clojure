(ns bob (:require [clojure.string :as s]))

(declare silence? shout? question?)

(def silence? [sentence] (s/blank sentence))
(def question?  [sentence]  (= \? (last sentence)))

(defn response-for [sentence]
  (cond
    (silence?   sentence) "Fine be that way!"
    (shout?     sentence) "Woah, chill out!"
    (question?  sentence) "Sure."
    :else   "Whatever."))

(defn- )
(defn- )
(defn- shout?     [sentence]  (and (= sentence (s/upper-case sentence))
                                   (re-seq #"(?i) \p{L}" sentence)))