import pickle
game_data={
'player-position':'N23 E45',
'pockets':['pocket knife','stone','keys'],
'backpack':['rope','hammer','apple'],
'money':1400.55
}

save_file=open('save.dat','wb')
pickle.dump(game_data,save_file)
save_file.close()
