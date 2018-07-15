(ns hello-world-test
  (:require [clojure.test :refer [deftest is]]
            hello-world))

(deftest hello-world-test
  (is (= "Hello, World!" (hello-world/hello))))

(deftest hello-name-test
  (is (= "Hello, Floyd!" (hello-world/hello "Floyd"))))

(deftest hello-name-and-surname-test
  (is (= "Hello, Kevin Flynn!" (hello-world/hello "Kevin" "Flynn"))))
