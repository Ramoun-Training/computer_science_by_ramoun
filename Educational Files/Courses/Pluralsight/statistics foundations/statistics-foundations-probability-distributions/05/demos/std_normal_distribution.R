N <- 1000
X <- rnorm(N, mean = 3, sd = 5)

s <- sum(X)
avg <- s / N
paste('expected mean of 3, got ', avg)

Y <- (X - avg) ^ 2
paste('expected variance of 25, got ', mean(Y))