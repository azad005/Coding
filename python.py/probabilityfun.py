
import scipy as sp
from scipy import norm, binom, bernoulli, poisson

#norm
data = sp. norm(10)


pdf_value = data.pdf(p=0.5)
print(f"PDF at 0.5: {pdf_value}")

#cdf
cdf_value = data.cdf(0.5)
print(f"CDF at 0.5: {cdf_value}")

#pmf