import time
#minute conversion.
def How_long_will_it_takes (max):
	 t2=time.time()
	 for x in range(0,max+1):
		 print(x)
	 t1=time.time()
	 T=round(t1-t2,2)
	 print("\nIt Took <<(%s)>> Seconds"%(T))
        # print("SPEED: %s counts per seconds"%(max/T))
        
