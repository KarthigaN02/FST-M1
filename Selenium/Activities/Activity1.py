# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    #Open the training support site. (https://training-support.net)
    driver.get("https://training-support.net/")

    #Print the title of the page
    print("Page title is: ", driver.title)

    #Click the about us button
    driver.find_element(By.LINK_TEXT, "About Us").click()

    #Print the title of the new page
    print("New page title is: ", driver.title)