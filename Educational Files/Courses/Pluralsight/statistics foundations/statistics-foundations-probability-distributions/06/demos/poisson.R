N <- 3600
lambda <- 5
result <- matrix(nrow = 10, ncol = 2)

for (x in 0:9) {
  result[[x + 1, 1]] = dbinom(x, N, lambda / N)
  result[[x+1, 2]] = dpois(x, lambda)
}

print(result)