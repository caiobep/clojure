(ns rna-transcription
  (:require [clojure.string :refer [split join]]))

(defn is-valid-dna? [a]
  (contains? #{"A" "G" "T" "C"} a))

(defn to-rna [dna]
  "Transcribe a DNA to RNA"
   (let [dna-char (split dna #"")]
        (when (some false? (map is-valid-dna? dna-char))
          (throw (AssertionError. "Wrong input.")))
        (->> dna-char
          (map #(case %
                  "C" "G"
                  "G" "C"
                  "A" "U"
                  "T" "A"))
          (join))))
