Feature: cek ongkir

  Scenario: cek harga ongkir

    Given I open anterAja cek ongkir web page
    When I input origin field
    And I input destination field
    And I click cek ongkir button
    Then successfully to view table price ongkir








