number_of_simulations <- 1000
wins <- logical(length = number_of_simulations)

p <- 0.4
p1_balance <- 99
p2_balance <- 1

# fair game: 0.5, 98, 2, expecting 0.98
# unfair game: 0.4, 99, 1, execting 2/3

for (i in 0:number_of_simulations) {
    p1b <- p1_balance
    p2b <- p2_balance

    while ((p1b > 0) && (p2b > 0)) {
        p1_wins = runif(1) < p

        if (p1_wins) {
            p1b = p1b + 1
            p2b = p2b - 1
        } else {
            p1b = p1b - 1
            p2b = p2b + 1
        }
    }

    wins[i] = p1b > 0
}

paste('player 1\'s probability of winning is ',
    (sum(wins)/number_of_simulations))