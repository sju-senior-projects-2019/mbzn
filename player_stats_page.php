<?php
//$xml = new SimpleXMLElement('https://api.mysportsfeeds.com/v1.0/pull/nfl/2018-regular/cumulative_player_stats.xml', 0, TRUE);

// Get cURL resource
$ch = curl_init();

// Set url
curl_setopt($ch, CURLOPT_URL, 'https://api.mysportsfeeds.com/v1.0/pull/nfl/2018-regular/cumulative_player_stats.xml');

// Set method
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'GET');

// Set options
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);

// Set compression
curl_setopt($ch, CURLOPT_ENCODING, "gzip");

// Set headers
curl_setopt($ch, CURLOPT_HTTPHEADER, [
	"Authorization: Basic " . base64_encode('3147f37d-4293-4dbe-8daa-328a63' . ":" . 'nflpassword')
]);

// Send the request & save response to $resp
$resp = curl_exec($ch);

if (!$resp) {
	die('Error: "' . curl_error($ch) . '" - Code: ' . curl_errno($ch));
} else {
	echo "Response HTTP Status Code : " . curl_getinfo($ch, CURLINFO_HTTP_CODE);
	echo "\nResponse HTTP Body : " . $resp;
}

// Close request to clear up some resources
curl_close($ch);


echo('<pre>');
//var_dump($xml);
echo('</pre>');

?>

<table>
  <thead>
    <tr>
      <th>Player Name</th>
      <th>Jersey Number</th>
      <th>Position</th>
      <th>Height</th>
      <th>Weight</th>
    </tr>
  </thead>
  <tbody>

<?php /*foreach ($xml->player as $licenseElement) :?>
    <tr>
      <td><?php echo $licenseElement->licName; ?></td>
      <td><?php echo $licenseElement->callsign; ?></td>
      <td><?php echo $licenseElement->serviceDesc; ?></td>
      <td><?php echo $licenseElement->statusDesc; ?></td>
      <td><?php echo $licenseElement->expiredDate; ?></td>
    </tr>
<?php endforeach; */ ?>
  </tbody>
</table>

