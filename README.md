# Contact Manager Desktop Application

A simple Contact Manager desktop application built with Java Swing. This application allows users to add, view, and delete contacts, storing them in a database.

## Features

- Add new contacts with name, email, and phone number.
- View a list of all contacts in a table.
- Delete selected contacts.
- Persistent storage using a database.

## Screenshots

<!-- Add screenshots here if available -->
![image](https://github.com/jallow13/PRODIGY_SD_03/assets/147343695/c3d8f5f5-ae93-4a59-b163-d46c100c013e)


## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/contact-manager.git
    ```

2. **Set up the database:**

    - Ensure you have a compatible database (e.g., SQLite, MySQL) set up.
    - Modify the `JavaConnect` class to connect to your database.

3. **Compile and run the application:**

    - Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
    - Compile and run the `phonebook` class.

## Usage

1. **Add a Contact:**
    - Enter the contact's name, email, and phone number in the respective text fields.
    - Click the "SAVE" button to add the contact to the database and update the table.

2. **Delete a Contact:**
    - Select a contact from the table.
    - Click the "delete" button.
    - Confirm the deletion in the dialog that appears.

## Project Structure

- `phonebook.java`: The main class for the application, containing the GUI and event handling.
- `JavaConnect.java`: A helper class to establish a database connection.
- `CONTACT`: The database table storing contact information (name, email, phone).

## Contributing

1. **Fork the repository:**

    - Click the "Fork" button on the top right of the repository page.

2. **Create a new branch:**

    ```bash
    git checkout -b feature-branch
    ```

3. **Make your changes:**

    - Ensure your code follows the project's coding conventions.

4. **Commit your changes:**

    ```bash
    git commit -m "Add feature"
    ```

5. **Push to the branch:**

    ```bash
    git push origin feature-branch
    ```

6. **Open a pull request:**

    - Go to the repository on GitHub.
    - Click the "Pull Request" button.
    - Provide a detailed description of your changes and submit the request.


## Contact

For any inquiries or feedback, please contact [mudasirujallow8@gmail.com](mailto:mudasirujallow8@gmail.com).
