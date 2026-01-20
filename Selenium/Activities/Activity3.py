from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    #Open a new browser to https://training-support.net/webelements/login-form/
    driver.get("https://training-support.net/webelements/login-form")
    #Get the title of the page and print it to the console.
    print("Page title is: ", driver.title)

    #Find the username field using any locator and enter "admin" into it.
    username = driver.find_element(By.XPATH, "//input[@id='username']")
    username.send_keys("admin")
    #Find the password field using any locator and enter "password" into it.
    password = driver.find_element(By.XPATH, "//input[@id='password']")
    password.send_keys("password")

    #Find the "Log in" button using any locator and click it.
    login = driver.find_element(By.XPATH, "//button[text()='Submit']")
    login.click()

    #Print the confirmation message after login
    message = driver.find_element(By.XPATH, "//h1[contains(@class, 'text-center')]")
    print("Login message: ", message.text)