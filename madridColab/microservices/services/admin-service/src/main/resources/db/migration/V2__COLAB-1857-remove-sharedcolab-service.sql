DELETE FROM xcolab_ConfigurationAttribute where name in
  ('IS_SHARED_COLAB', 'SHARED_COLAB_NAMESPACE', 'PARTNER_COLAB_NAME',
  'PARTNER_COLAB_NAMESPACE', 'PARTNER_COLAB_ADDRESS');
