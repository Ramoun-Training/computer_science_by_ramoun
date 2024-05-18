## Problem: grab the word 'hello' from the following dictionaries

d1 = {'simple_key': 'hello'}
print(d1['simple_key'])

d2 = {'k1': {'k2': 'hello'}}
print(d2['k1']['k2'])

d3 = {'k1':[{'nest_key' :['this is deep', ['hello']]}]}
print(d3['k1'][0]['nest_key'][1])
