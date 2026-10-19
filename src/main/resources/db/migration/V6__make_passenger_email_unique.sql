-- Passenger email is the login identifier and must be unique.
ALTER TABLE passenger
    ADD CONSTRAINT uk_passenger_email UNIQUE (email);
