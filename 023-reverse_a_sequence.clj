;; Reverse a Sequence
;;
;; Write a function which reverses a sequence.  (= (__ [1 2 3 4 5]) [5 4 3 2 1])  (= (__ (sorted-set 5 7 2 7)) '(7 5 2))  (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])Special Restrictionsreverserseq
;;
;; test cases:
;;   (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;;   (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;;   (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(fn reverse' [s]
  (if-let [s' (seq s)]
    (let [parts (split-at 1 s')]
      (concat (reverse' (last parts)) (first parts)))
    s))