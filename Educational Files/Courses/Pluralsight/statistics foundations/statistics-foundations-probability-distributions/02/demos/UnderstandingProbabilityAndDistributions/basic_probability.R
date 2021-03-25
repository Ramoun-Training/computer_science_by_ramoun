N <- 100

flips <- runif(N, min = 0, max = 1) > 0.5
sum(flips) / N

sample.space <- c(0, 1)
flips <- sample(sample.space, N, replace = TRUE, prob = c(0.5, 0.5))
sum(flips) / N