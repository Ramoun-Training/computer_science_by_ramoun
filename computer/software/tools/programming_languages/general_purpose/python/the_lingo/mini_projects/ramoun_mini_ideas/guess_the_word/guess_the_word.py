secret = 'ramoun'
guess = input('enter your guess: ')
guess_count = 0
guess_limit = 3
out_of_guesses = False

while guess != secret and not(out_of_guesses):
    if guess_count < guess_limit:
        guess = input('enter your guess: ')
        guess_count += 1
    else:
        out_of_guesses = True
        
if out_of_guesses:
    print('you lost, sorry.')        
else:
    print('you won.')