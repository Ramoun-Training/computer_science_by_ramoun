# there is no covariance between random data
X <- rnorm(1000)
Y <- rnorm(1000)
paste('covariance = ', cov(X, Y))

# linearly dependent data
X <- rnorm(1000)
Y <- X * X # * 5 multiplication factor linked to covariance
paste('covariance = ', cov(X, Y))
paste('correlation = ', cor(X, Y))