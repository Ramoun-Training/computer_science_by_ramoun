# a very bad implementaion
# def raise_to_power(base, power):    
#     if power > 1:
#         return base * raise_to_power(base, power - 1) 
#     else:
#         return base

# print(raise_to_power(2, 4))

# # 2 * (2 * (2 * (2)))


def raise_to_power(base, power):    
    if power > 0:
        return base * raise_to_power(base, power - 1) 
    else:
        return 1

print(raise_to_power(2, 4))