;; Interleave Two Seqs
;;
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.  (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))  (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))  (= (__ [1 2 3 4] [5]) [1 5])  (= (__ [30 20] [25 15]) [30 25 20 15])Special Restrictionsinterleave
;;
;; test cases:
;;   (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;;   (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;;   (= (__ [1 2 3 4] [5]) [1 5])
;;   (= (__ [30 20] [25 15]) [30 25 20 15])

(fn i [one two]
  (let [h1 (first one)
        t1 (rest one)
        h2 (first two)
        t2 (rest two)]
    (if (and h1 h2)
      (cons h1 (cons h2 (i t1 t2))))))