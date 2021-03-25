require("Rmpfr")

perm <- function(n, k) {
    return (factorialMpfr(n)/factorialMpfr(n-k))
}

count <- 100

p <- double(count)

for (k in 1:count) {
    d <- (1 - perm(365, k) / (mpfr(365, precBits = 1024) ^ k)) * 100
    p[k] <- asNumeric(d)
}

plot(1:count, p, xlab = "Number of people in the room",
    ylab="Probability in %")