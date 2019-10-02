#!/usr/bin/env python
# coding: utf-8

# In[83]:


import pandas as pd


# In[92]:


data  =  pd.read_csv('apy.csv')


# In[93]:


data.columns


# In[138]:


len(data['District_Name'])


# In[ ]:





# In[95]:


data["Season"].head(8)


# In[186]:


li


# In[200]:


li = set(data['State_Name'])
state = input()
city = input()


# In[201]:


k = data.loc[(data['State_Name'] == state) & (data['District_Name'] == city)]
print(len(set(k['Crop'])))
list(set(k['Crop']))
print(k.shape)
k.head()


# In[202]:


print(data.shape)
data.head()


# In[203]:


set(data['Season'])


# In[204]:


import numpy as np
SSS = np.array(['Water','market_Demand','present_production','overload_stock','profit_to_farmer'])
QQQ = np.array([0.3,0.89,0.4,-0.3,0.8])


# In[205]:


crop_ = np.array(list(set(data['Crop'])))
Water  = np.random.random((len(crop_)))
market_Demand = np.random.random((len(crop_)))
present_production = np.random.random((len(crop_)))
overload_stock = np.random.random((len(crop_)))
profit_to_farmer = np.random.random((len(crop_)))


# In[212]:


df = pd.DataFrame()
print(crop_.shape,Water.shape)


# In[213]:


df['crop'] = crop_ 
df['Water ']  = Water
df['market_Demand'] = market_Demand
df['present_production'] = present_production
df['overload_stock'] = overload_stock
df['profit_to_farmer'] = profit_to_farmer
df1 = df.drop(columns=['crop'])
df.head(10)


# In[208]:


m = []
for i in range(len(crop_)):
    m.append(np.dot(df1.iloc[i].values,QQQ))
    
df['result'] = m


# In[209]:


df.head()


# In[210]:


df2 = df.sort_values(by ='result' )


# In[211]:


df2.iloc[::-1]


# In[ ]:



