# SELENIUM

from selenium import webdriver
from selenium.webdriver.edge.service import Service       # for edge
# from selenium.webdriver.chrome.service import Service       # for chrome
import time

# To Keep Browser Open Indefinitely for edge
options = webdriver.EdgeOptions()
options.add_experimental_option("detach", True)

# To Keep Browser Open Indefinitely for chrome
# options = webdriver.ChromeOptions()
# options.add_experimental_option("detach", True)

# Chrome Driver
# service_obj = Service()
# driver = webdriver.Chrome(options=options, service=service_obj)

# Edge Driver
service_obj = Service()
driver = webdriver.Edge(options=options, service=service_obj)

driver.maximize_window()

# Browser open and access
driver.get("http://www.google.com")

# driver.minimize_window()

# print(driver.title) #Website name
# print(driver.current_url) #Website Link

driver.get("http://www.facebook.com")

driver.back()  # Moves to Google
driver.forward()  # Moves to Facebook

driver.refresh()  # Reload

driver.close()  # Closes Browser