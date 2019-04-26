import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.pyplot as plt1
from sklearn.linear_model import LinearRegression
from pandas import DataFrame

data = pd.read_csv('Brees.csv')



X = data['Passing YDS'].values[:,np.newaxis]

y = data['Fantasy Points'].values


model = LinearRegression()

model.fit(X, y)

plt.scatter(X, y, color='r')

plt.plot(X, model.predict(X),color='k')
plt.title('Drew Brees: Points vs. Passing Yards')
plt.xlabel('Passing Yards')
plt.ylabel('Fantasy Points')


plt.show()

df = pd.DataFrame(model.predict(X), columns= ['Predicted Points'])

df2 =pd.DataFrame(y, columns=['Points'])

df.to_csv('/Users/zachnelson/Desktop/CSC-310/SENIOR PROJECT/predictions2.csv', sep='\t')


predData = pd.read_csv("predPoints2.csv")



B = predData['Predicted Points']
c = data['Passing YDS']
d = data['Fantasy Points']
plt1.scatter(c,B, color='g')
plt.title('Drew Brees: Predicted Points vs. Passing Yards')
plt.xlabel('Passing Yards')
plt.ylabel('Predicted Fantasy Points')
plt1.show()


df3 = pd.DataFrame({'Actual': d, 'Predicted': B})
print(df3)
