(ns rna-transcription
  (:require [clojure.string :refer [split join]]))

(def substitutions {\G \C
                    \C \G
                    \T \A
                    \A \U})



(defn to-rna [dna]
  "Transcribe a DNA to RNA"
  (apply str
        (map (fn [a]
               (assert (contains? substitutions a))
               (get substitutions a))
            dna)))
