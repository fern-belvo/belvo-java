package com.belvo.api.resources.secretkeys;

import com.belvo.api.types.SecretKeys;
import com.belvo.api.types.SecretKeysPaginatedResponse;
import java.util.List;

public interface SecretKeysClient {
  SecretKeysPaginatedResponse listSecretKeys();

  List<SecretKeys> createSecretKeys();
}
